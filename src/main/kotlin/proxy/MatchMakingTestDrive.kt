package proxy

import logging.logger
import java.lang.reflect.Proxy

class MatchMakingTestDrive {
    private val datingDB: MutableMap<String, Person> = mutableMapOf()

    init {
        initializeDatabase()
    }

    fun drive() {
        val kim: Person = getPersonFromDatabase("김자바")
        val ownerProxy: Person = getOwnerProxy(kim)

        logger.info { "이름: ${ownerProxy.name}" }

        logger.info { "본인 프록시에 관심 사항을 등록합니다." }
        logger.info { "before 관심 사항: ${ownerProxy.interests}" }
        ownerProxy.interests = "볼링, 바둑"
        logger.info { "after 관심 사항: ${ownerProxy.interests}" }

        try {
            ownerProxy.geekRating = 10
        } catch (e: Exception) {
            logger.error { "본인 프록시에는 괴짜 지수를 매길 수 없습니다." }
        }

        val lee: Person = getPersonFromDatabase("이파이")
        val nonOwnerProxy: Person = getNonOwnerProxy(lee)

        logger.info { "이름: ${nonOwnerProxy.name}" }

        logger.info { "타인 프록시에 관심 사항을 등록합니다." }
        logger.info { "before 관심 사항: ${nonOwnerProxy.interests}" }
        try {
            nonOwnerProxy.interests = "볼링, 바둑"
        } catch (e: Exception) {
            logger.error { "타인 프록시에는 관심 사항을 등록할 수 없습니다." }
        }
        logger.info { "after 관심 사항: ${nonOwnerProxy.interests}" }

        logger.info { "타인 프록시에 괴짜 지수를 등록합니다." }
        logger.info { "before 괴짜 지수: ${nonOwnerProxy.geekRating}" }
        nonOwnerProxy.geekRating = 4
        logger.info { "after 괴짜 지수: ${nonOwnerProxy.geekRating}" }
    }

    private fun getPersonFromDatabase(name: String): Person =
        datingDB[name] ?: throw IllegalArgumentException()

    private fun getOwnerProxy(person: Person): Person {
        return Proxy.newProxyInstance(
            person.javaClass.classLoader,
            person.javaClass.interfaces,
            OwnerInvocationHandler(person)
        ) as Person
    }

    private fun getNonOwnerProxy(person: Person): Person {
        return Proxy.newProxyInstance(
            person.javaClass.classLoader,
            person.javaClass.interfaces,
            NonOwnerInvocationHandler(person)
        ) as Person
    }

    private fun initializeDatabase() {
        val kim = PersonImpl(name = "김자바", gender = "남", interests = "자동차, 컴퓨터, 음악", rating = 7)
        datingDB[kim.name] = kim
        val lee = PersonImpl(name = "이파이", gender = "여", interests = "이베이, 영화, 음악", rating = 6)
        datingDB[lee.name] = lee
    }
}

fun main() {
    MatchMakingTestDrive().drive()
}
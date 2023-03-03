package proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

// 자신의 정보에 접근할 때 사용
class OwnerInvocationHandler(
    private val person: Person
) : InvocationHandler {

    override fun invoke(proxy: Any, method: Method, args: Array<out Any>?): Any? {
        val methodName = method.name
        val arguments = args ?: emptyArray()

        if (methodName.startsWith("get")) {
            return method.invoke(person, *arguments)
        } else if (methodName.equals("setGeekRating")) {
            throw IllegalAccessException()
        } else if (methodName.startsWith("set")) {
            return method.invoke(person, *arguments)
        }

        // 다른 메소드가 호출된다면 null을 반환하기로 함
        return null
    }

}
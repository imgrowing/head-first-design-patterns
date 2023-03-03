package proxy

class PersonImpl(
    override val name: String,
    override val gender: String,
    override var interests: String,
    private var rating: Int,
) : Person {
    private var ratingCount: Int = 1

    override var geekRating: Int
        get() = if (ratingCount == 0) 0 else (rating/ratingCount)
        set(rating) {
            this.rating += rating
            ratingCount++
        }
}
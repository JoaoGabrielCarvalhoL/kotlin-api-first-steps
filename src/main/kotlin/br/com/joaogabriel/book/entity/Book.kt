package br.com.joaogabriel.book.entity

import jakarta.persistence.*
import java.io.Serializable
import java.util.*

@Entity
@Table(name = "tb_book")
data class Book(

    @Column(nullable = false)
    private var title: String,
    @Column(nullable = false)
    private var description: String

) : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private lateinit var id: UUID

    @Column(nullable = true)
    private lateinit var bookCover: ByteArray

    @JoinColumn(nullable = false, referencedColumnName = "id", name = "category_id")
    @ManyToOne(cascade = [CascadeType.PERSIST], fetch = FetchType.EAGER)
    private lateinit var category: Category

    @JoinColumn(nullable = false, referencedColumnName = "id", name = "author_id")
    @ManyToOne(cascade = [CascadeType.PERSIST], fetch = FetchType.EAGER)
    private lateinit var author: Author

    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER, cascade = [CascadeType.PERSIST])
    private lateinit var available: MutableList<Available>

    constructor(
        title: String, description: String, id: UUID, bookCover: ByteArray,
        category: Category, author: Author, available: MutableList<Available>
    ) : this(title, description) {
        this.id = id
        this.bookCover = bookCover
        this.category = category;
        this.author = author;
        this.available = available
    }

    constructor(
        title: String, description: String, bookCover: ByteArray,
        category: Category, author: Author
    ) : this(title, description) {
        this.bookCover = bookCover
        this.category = category;
        this.author = author;
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        return id == other.id
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

    fun getId(): UUID {
        return id
    }

    fun setId(id: UUID) : Unit {
        this.id = id;
    }

    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) : Unit {
        this.title = title
    }

    fun getDescription(): String {
        return description
    }

    fun setDescription(description: String) : Unit {
        this.description = description
    }

    fun getBookCover(): ByteArray {
        return bookCover
    }

    fun setBookCover(bookCover: ByteArray) : Unit {
        this.bookCover = bookCover
    }

    fun getCategory(): Category {
        return category
    }

    fun setCategory(category: Category) {
        this.category = category;
    }

    fun getAuthor(): Author {
        return author
    }

    fun setAuthor(author: Author) : Unit {
        this.author = author
    }

    fun getAvailable(): MutableList<Available> {
        return available
    }

    fun setAvailable(available : MutableList<Available>) : Unit {
        this.available = available
    }
}

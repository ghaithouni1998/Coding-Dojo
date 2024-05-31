package com.ghaith.book.club.models;



@Entity
@Table(name="books")
public class Book {

	// MEMBER VARIABLES
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 200, message ="you need a title !")
	private String title;
	
	@NotBlank
	@Size(min = 4, max = 100)
	private String author;
	
	@NotBlank
	@Size(min = 4, max = 100)
	private String thoughts;
	
	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
   // M : 1 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="publisher_id")
    private Publisher publisher;
    
    // M:1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="author_id")
    private User author;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	// zero-args constructor
    public Book() {
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
    
//	----- methods ---
    // other getters and setters removed for brevity
   
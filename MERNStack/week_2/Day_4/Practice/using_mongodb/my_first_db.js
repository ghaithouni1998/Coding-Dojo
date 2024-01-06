use my_first_db

db.createCollection("students")


// 1
db.students.insertOne({
  name: "ghaith",
  home_state: "tunis",
  lucky_number: 24,
  birthday: { month: 24, day: 2, year: 1998 }
}

//  2
db.students.insertOne({
  name: "jihed",
  home_state: "nabeul",
  lucky_number: 11,
  birthday: { month: 26, day: 5, year: 2002 }
})



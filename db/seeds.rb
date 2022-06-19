# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the bin/rails db:seed command (or created alongside the database with db:setup).
#
# Examples:
#
#   movies = Movie.create([{ name: "Star Wars" }, { name: "Lord of the Rings" }])
#   Character.create(name: "Luke", movie: movies.first)

user = User.create({
  name: "Javi",
  email: "test@gmail.com"
})

friend = Friend.create({
  name: "Javi's Friend",
  email: "iamafriend@gmail.com"
})

chat = Chat.create({
  chatroomID: 1,
  senderID: 2,
  recipientID: 3,
  message: "I hate tiktok"
})

video = Video.create({
  hostID: 1,
  guestID: 2
})
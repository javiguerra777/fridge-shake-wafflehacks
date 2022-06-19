class CreateChats < ActiveRecord::Migration[7.0]
  def change
    create_table :chats do |t|
      t.integer :chatroomID
      t.integer :senderID
      t.integer :recipientID
      t.string :message

      t.timestamps
    end
  end
end

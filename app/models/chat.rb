class Chat < ApplicationRecord
    validates :chatroomID, presence: true
    validates :senderID, presence: true
    validates :recipientID, presence: true
    validates :message, presence: true
    has_many :users
end

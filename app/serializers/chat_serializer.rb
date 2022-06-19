class ChatSerializer < ActiveModel::Serializer
  attributes :id, :chatroomID, :senderID, :recipientID, :message
end

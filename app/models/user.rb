class User < ApplicationRecord
  validates :name, presence: true
  validates :email, presence: true
  
  has_many :friends
  belongs_to :video
  belongs_to :chat
end

class User < ApplicationRecord
  validates :name, presence: true
  validates :email, presence:true, uniqueness: true,  format: { with: /\A[^@\s]+@[^@\s]+\z/, message: 'Invalid email' }
  validates :password, presence: true
end

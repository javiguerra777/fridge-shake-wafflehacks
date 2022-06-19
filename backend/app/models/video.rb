class Video < ApplicationRecord
    validates :hostID, presence: true
    validates :guestID, presence: true
    has_many :users
end

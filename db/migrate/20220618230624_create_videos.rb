class CreateVideos < ActiveRecord::Migration[7.0]
  def change
    create_table :videos do |t|
      t.integer :hostID
      t.integer :guestID

      t.timestamps
    end
  end
end

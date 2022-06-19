class FriendsController < ApplicationController
    def index
        friends = Friend.all
        render json: friends
    end
    
    def show
        friend = Friend.find(params[:id])
        render json: friend
    end
    
    def create
        friend = Friend.new(friend_params)
        if friend.save
          render json: friend
        else
          render json: {error: 'Unable to create friend'}, status: 400
        end
    end
    
    def update
        friend = Friend.find(params[:id])
        if friend
          friend.update(friend_params)
          render json: friend, status: 200
        else
          render json: {error: 'Unable to update friend'}, status: 400
        end
    end
    
    def destroy
        friend = Friend.find(params[:id])
        if friend
          friend.destroy
          render json: friend, status: 200
        else
          render json: {error: 'Unable to delete friend'}, status: 400
        end
    end
    
    private
    
    def friend_params
        params.permit(:name, :email)
    end
end
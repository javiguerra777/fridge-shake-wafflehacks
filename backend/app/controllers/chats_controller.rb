class ChatsController < ApplicationController
    def index
        chats = Chat.all
        render json: chats
    end
    
    def show
        chat = Friend.chat(params[:id])
        render json: chat
    end
    
    def create
        chat = Chat.new(chat)
        if chat.save
          render json: friend
        else
          render json: {error: 'Unable to create chat'}, status: 400
        end
    end
    
    def update
        chat = Chat.find(params[:id])
        if chat
          chat.update(chat_params)
          render json: chat, status: 200
        else
          render json: {error: 'Unable to update chat'}, status: 400
        end
    end
    
    def destroy
        chat = Chat.find(params[:id])
        if chat
          chat.destroy
          render json: chat, status: 200
        else
          render json: {error: 'Unable to delete chat'}, status: 400
        end
    end
    
    private
    
    def chat_params
        params.permit(:chatroomID, :sendID, :recipientID, :message)
    end
end

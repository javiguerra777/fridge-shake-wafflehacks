class VideosController < ApplicationController
    def index
        videos = Video.all
        render json: videos
      end
    
      def show
        video = Video.find(params[:id])
        render json: video
      end
    
      def create
        video = Video.new(video_params)
        if video.save
          render json: video
        else
          render json: {error: 'Unable to create video'}, status: 400
        end
      end
    
      def update
        video = Video.find(params[:id])
        if video
          video.update(video_params)
          render json: video, status: 200
        else
          render json: {error: 'Unable to update video'}, status: 400
        end
      end
    
      def destroy
        video = Video.find(params[:id])
        if video
          video.destroy
          render json: video, status: 200
        else
          render json: {error: 'Unable to delete video'}, status: 400
        end
      end
    
      private
    
      def video_params
        params.permit(:hostID, :guestID)
      end
end

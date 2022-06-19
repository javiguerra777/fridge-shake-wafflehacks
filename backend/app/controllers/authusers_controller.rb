class AuthusersController < ApplicationController
  def create
    user = User.find_by(email: params[:email])
    if params[:email] == user.email && params[:password] == user.password
      render json: {message:'good login', loggedin: true}, status: 200
    else
      render json: {error:'email does not exist'}, status: 400
    end
  end
end

ssh_options[:forward_agent] = true
set :application, "ogilvy-interviews"
set :repository,  "ssh://git@github.com/quicktv/#{application}.git"
set :branch, 'master'
set :scm, :git
set :play_path, "/usr/local/play-current"
set :shared_path, "#{deploy_to}/shared"
set :app_pid, "#{shared_path}/pids/server.pid"
set :app_path, "#{deploy_to}/current"
set :domain, "54.246.105.99"
set :user, "ubuntu"
set :svn_user, ENV['svn_user']
set :svn_password, ENV['svn_password']
role :web, domain
role :app, domain
role :db,  domain, :primary => true

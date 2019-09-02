// View Management
class Dispatcher
{
    private FacebookView facebook_view;
    private TwitterView twitter_view;

    public Dispatcher()
    {
        facebook_view = new FacebookView();
        teacherView = new TeacherView();
    }

    public void dispatch(String ip)
    {
        switch(ip){
          case "192.168.1.1":
            facebook_view.display();
            break;
          case "809.122.1.0":
            twitter_view.display();
            break;
        }
    }
}

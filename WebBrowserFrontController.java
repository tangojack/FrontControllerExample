// Request Management
class WebBrowserFrontController {

  private Dispatcher dispatcher;

  public WebBrowserFrontController{
      dispatcher = new Dispatcher();
  }

  private void do_get(String url){
    get_ip = url;
    if (get_ip == -1){
      System.out.print("Error 404, IP Not Found");
    }
    else{
      dispatcher.dispatch(ip);
    }
  }

  private String get_ip(String url){
    return (url in dns) ? ip : -1;
  }

}

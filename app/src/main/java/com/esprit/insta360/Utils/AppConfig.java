package com.esprit.insta360.Utils;

/**
 * Created by TIBH on 07/11/2016.
 */

public class AppConfig {

    public static String IP ="192.168.1.66" ;


    // user
    public static String URL_LOGIN = "http://"+IP+"/insta360/users/login.php";
    public static String URL_REGISTER = "http://"+IP+"/insta360/users/register.php";
    public static String URL_LOAD_PHOTO = "http://"+IP+"/insta360/users/updateUserImage.php";


    public static String URL_NOTIFY = "http://"+IP+"/insta360/notifications/addNotification.php";
    public static String URL_GET_NOTIFICATIONS = "http://"+IP+"/insta360/notifications/getNotificationsByReceiver.php";


}

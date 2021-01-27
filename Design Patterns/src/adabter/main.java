package DesignPatterns;

public class main {

    static abstract class client{
        public String serviceRequest() {
            return "asking for service ";
        }
    }

     static class service{
        public String linkAdress() {
            return "service has been given to client";
        }
    }

    static class adabter extends client {
        private service serv;

        adabter(service ser) {
            serv = ser;
        }
        public String serviceRequest() {
            String converter = serv.linkAdress();
            return converter;
        }

    }

     static void clientService(client c) {
        System.out.println(c.serviceRequest());
     }

    public static void main(String [] args) {

        service s = new service();
        adabter d = new adabter(s);
        clientService(d);
    }
}

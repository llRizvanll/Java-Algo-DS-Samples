package designpatterns.behavioral.visitor;

public interface IRouter {
    void sendData(char[] data);
    void acceptData(char[] data);
    void accept(RouterVisitor visitor);
}

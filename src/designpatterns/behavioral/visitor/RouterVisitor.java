package designpatterns.behavioral.visitor;

public interface RouterVisitor {
    void visit(DLinkRouter router);
    void visit(TPLinkRouter router);
    void visit(LinkSysRouter router);
}

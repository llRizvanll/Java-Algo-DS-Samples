package designpatterns.behavioral.visitor;

public class TestVisitPattern {

    private MacConfigurator macConfigurator;
    private LinuxConfigurator linuxConfigurator;
    private DLinkRouter dLinkRouter;
    private TPLinkRouter tpLinkRouter;
    private LinkSysRouter linkSysRouter;

    public void setup(){
        macConfigurator = new MacConfigurator();
        linuxConfigurator = new LinuxConfigurator();


        dLinkRouter = new DLinkRouter();
        tpLinkRouter = new TPLinkRouter();
        linkSysRouter = new LinkSysRouter();
    }

    public void testDlink()
    {
        dLinkRouter.accept(macConfigurator);
        dLinkRouter.accept(linuxConfigurator);
    }

    public void testTPLink()
    {
        tpLinkRouter.accept(macConfigurator);
        tpLinkRouter.accept(linuxConfigurator);
    }

    public void testLinkSys()
    {
        linkSysRouter.accept(macConfigurator);
        linkSysRouter.accept(linuxConfigurator);
    }
}

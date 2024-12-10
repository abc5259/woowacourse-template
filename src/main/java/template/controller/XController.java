package template.controller;

import template.service.XService;
import template.view.OutputView;

public class XController {


    private final IteratorInputHandler iteratorInputHandler;
    private final OutputView outputView;
    private final XService xService;

    public XController(IteratorInputHandler iteratorInputHandler, OutputView outputView, XService xService) {
        this.iteratorInputHandler = iteratorInputHandler;
        this.outputView = outputView;
        this.xService = xService;
    }

    public void process() {

    }
}

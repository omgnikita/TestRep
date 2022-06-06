package com.company.chainOfResponsibility;

import java.util.List;

abstract public class Container extends Component {
    protected List<Component> children;

    public void add(Component child) {
        children.add(child);
        child.container = this;
    }

    @Override
    public void showHelp() {
        super.showHelp();
    }
}

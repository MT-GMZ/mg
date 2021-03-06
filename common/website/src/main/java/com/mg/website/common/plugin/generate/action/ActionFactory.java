package com.mg.website.common.plugin.generate.action;


import com.mg.common.plugin.igenerate.IFactory;
import com.mg.website.common.action.sys.SysItem;

public class ActionFactory extends IFactory {
    public ActionFactory(SysItem item) {
        try {
            addMakeUp(new ActionMakeUp(item.getName(),
                    Class.forName(item.getInVoName()),
                    Class.forName(item.getOutVoName()),
                    Class.forName(item.getInDtoName()),
                    Class.forName(item.getOutDtoName()),
                    item.getMethods()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

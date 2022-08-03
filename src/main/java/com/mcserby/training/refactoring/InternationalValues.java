package com.mcserby.training.refactoring;

import java.util.HashMap;
import java.util.Map;

public class InternationalValues {

    private Map<String, Details> detailsMap;

    InternationalValues()
    {
        detailsMap = new HashMap<>();
        detailsMap.put("Uk", null);
        detailsMap.put("Nl", null);
        detailsMap.put("De", null);
        detailsMap.put("Fr", null);
        detailsMap.put("Es", null);
        detailsMap.put("It", null);
        detailsMap.put("At", null);
        detailsMap.put("ChFr", null);
        detailsMap.put("ChDe", null);
        detailsMap.put("Ru", null);
        detailsMap.put("Hr", null);
        detailsMap.put("Gr", null);
        detailsMap.put("Sl", null);
        detailsMap.put("ChIt", null);
        detailsMap.put("BeFr", null);
        detailsMap.put("LuDe", null);
        detailsMap.put("Li", null);
        detailsMap.put("Pl", null);
        detailsMap.put("Bl", null);
        detailsMap.put("Ua", null);
        detailsMap.put("Cz", null);
        detailsMap.put("Sv", null);
        detailsMap.put("CaEs", null);
        detailsMap.put("Zh", null);
        detailsMap.put("LuFr", null);
        detailsMap.put("BeNl", null);

    }

    public Details getDetail(String name) {
        return detailsMap.get(name);
    }
    public void setDetail(String name, Details value) {
         detailsMap.put(name, value);
    }
}

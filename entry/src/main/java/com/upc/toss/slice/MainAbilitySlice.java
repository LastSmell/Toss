package com.upc.toss.slice;

import com.upc.toss.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.*;


public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);

        super.setUIContent(ResourceTable.Layout_ability_main);
        //创建按钮
        Button button=(Button) findComponentById(ResourceTable.Id_button);
        //按钮点击跳转
        button.setClickedListener(listener->present(new SecondAbilitySlice(),new Intent()));

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}

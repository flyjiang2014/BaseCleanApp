package com.clean.flyjiang.cleanbaseapp.ui.index;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.clean.flyjiang.cleanbaseapp.R;
import com.clean.flyjiang.cleanbaseapp.base.BaseActivity;
import com.clean.flyjiang.cleanbaseapp.widget.loading.LoadingLayout;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

public class MainActivity extends BaseActivity {
    @Bind(R.id.tv_test)
    TextView tvTest;
    @Bind(R.id.rl_test)
    RecyclerView rlTest;
    List<String> lists = new ArrayList<>();
    @Bind(R.id.img_test01)
    ImageView imgTest01;

    @Override
    public int setBaseContentView() {
        //   setIsShowTitle(false);
        setIsUseLoading(false);
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        byte[] data = {0, 1, 0, 2, 0, 0, 0, 106};
        ByteBuffer buffer = ByteBuffer.wrap(data);
        Log.e("jiang",buffer.getShort()+"");
        Log.e("jiang",buffer.getShort()+"");
        Log.e("jiang",buffer.getInt()+"");

    }

    @Override
    public void init() {
        mLoadingLayout.setStatus(LoadingLayout.Success);
        Glide.with(mContext)
                .load("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1507561251&di=c8931e77dc4474a0922e9d29891795d8&src=http://img.xgo-img.com.cn/pics/1545/a1544725.jpg")
                .into(imgTest01);
      //  GlideApp.with(mContext).load(null).
    }
}

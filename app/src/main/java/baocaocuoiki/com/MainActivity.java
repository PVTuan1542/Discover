package baocaocuoiki.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        search();

        init();
        init_playlist();
        init_radio();
        init_casi();
        init_hoatdong();
        init_zingchat();
        init_top100();
    }

    //xu ly search

    public void search(){
        editText = (EditText) findViewById(R.id.search);

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == editText.getId())
                {
                    editText.setCursorVisible(true);
                }
            }
        });

        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent event) {
                editText.setCursorVisible(false);
                if (event != null&& (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) {
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(editText.getApplicationWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
                }
                return false;
            }
        });
    }
    public  void init(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<List_baiHat> arrayList =  new ArrayList<>();
        arrayList.add(new List_baiHat(R.drawable.vpop_thang_moi,"V-Pop tháng 11 có gì hót"));
        arrayList.add(new List_baiHat(R.drawable.vpop_tiem_nang,"Tiềm năng V-Pop"));
        arrayList.add(new List_baiHat(R.drawable.vpop_rap,"Thức dậy ráp thôi"));
        arrayList.add(new List_baiHat(R.drawable.vpop_cover,"Cover Việt ngày nay"));
        arrayList.add(new List_baiHat(R.drawable.vpop_nhac_han,"Nhac phim Hàn Quốc tuổi học trò"));

        Adapter_BaiHat adapter = new Adapter_BaiHat(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    public  void init_radio(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_radio);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<List_baiHat> arrayList_radio =  new ArrayList<>();
        arrayList_radio.add(new List_baiHat(R.drawable.radio_cu_voi_vang,"Cứ vội vàng"));
        arrayList_radio.add(new List_baiHat(R.drawable.radio_keo_bong_gon,"Kẻo bông gòn"));
        arrayList_radio.add(new List_baiHat(R.drawable.radio_danh_mat_em,"Đánh mất em"));
        arrayList_radio.add(new List_baiHat(R.drawable.radio_em_be,"Em bé"));


        Adapter_BaiHat adapter = new Adapter_BaiHat(arrayList_radio,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    public  void init_playlist(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_playlist);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<List_baiHat> arrayList =  new ArrayList<>();
        arrayList.add(new List_baiHat(R.drawable.play_con_tim_hay_li_tri,"Chọn con tim hay lý trí"));
        arrayList.add(new List_baiHat(R.drawable.play_em_van_on,"Em vẫn ổn"));
        arrayList.add(new List_baiHat(R.drawable.play_ko_the_cung_nhau,"Không thể cùng nhau"));
        arrayList.add(new List_baiHat(R.drawable.play_nhac_trung,"Nhac Trung"));
        arrayList.add(new List_baiHat(R.drawable.play_nghe_nhieu_nhat,"Nhac nghe nhiều nhất"));

        Adapter_BaiHat adapter = new Adapter_BaiHat(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    public  void init_casi(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_casi);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<casi> arrayList_casi =  new ArrayList<>();
        arrayList_casi.add(new casi(R.drawable.cs_huongtram,"Hương Tràm"));
        arrayList_casi.add(new casi(R.drawable.cs_lbb,"Lê Bảo Bình"));
        arrayList_casi.add(new casi(R.drawable.cs_quan,"Quân AP"));
        arrayList_casi.add(new casi(R.drawable.cs_thanhung,"Thanh Hưng"));

        Adapter_casi adapter = new Adapter_casi(arrayList_casi,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    public  void init_hoatdong(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_hoatdong);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<HoatDong> arrayList =  new ArrayList<>();
        arrayList.add(new HoatDong(R.drawable.zc_chill,"Chill"));
        arrayList.add(new HoatDong(R.drawable.zc_giai_dieu_buon,"Giai điệu buồn"));
        arrayList.add(new HoatDong(R.drawable.zc_mua,"Mưa"));
        arrayList.add(new HoatDong(R.drawable.zc_tap_trung,"Tập trung"));
        arrayList.add(new HoatDong(R.drawable.zc_thu_gian,"Thư giãn"));

        Adapter_HoatDong adapter = new Adapter_HoatDong(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    public  void init_zingchat(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_zingchat);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<List_baiHat> arrayList =  new ArrayList<>();
        arrayList.add(new List_baiHat(R.drawable.top_one,"Chill","Noo Phước Thịnh","01"));
        arrayList.add(new List_baiHat(R.drawable.top_thiengdang,"Thiên Đàng","Wowy,JoliPoli","02"));
        arrayList.add(new List_baiHat(R.drawable.top_hoa_hai_duong,"Hoa Hải Đường","Jack","03"));
        arrayList.add(new List_baiHat(R.drawable.top_ket_thuc_lung_chung,"Kết Thúc Lưng Chừng","Văn Võ Ngọc Nhân","04"));
        arrayList.add(new List_baiHat(R.drawable.top_anhmetroi,"Anh Mệt Rồi","Anh Quân Idol","05"));

        AdapterZingChat adapter = new AdapterZingChat(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }

    public  void init_top100(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_Top100);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<List_baiHat> arrayList =  new ArrayList<>();
        arrayList.add(new List_baiHat(R.drawable.top_vpop,"Top 100 Nhạc V-Pop Hay Nhất"));
        arrayList.add(new List_baiHat(R.drawable.top_rap_viet,"Top 100 Nhạc Rap Việt Hay Nhất"));
        arrayList.add(new List_baiHat(R.drawable.top_edm,"Top 100 Nhạc EDM Hay Nhất"));
        arrayList.add(new List_baiHat(R.drawable.top_pop_au_my,"Top 100 Nhạc Pop Âu Mỹ Hay Nhất"));
        arrayList.add(new List_baiHat(R.drawable.top_nhac_tre,"Top 100 Nhạc Trẻ Hay Nhất"));
        arrayList.add(new List_baiHat(R.drawable.top_han,"Top 100 Nhạc Hàn Hay Nhất"));

        Adapter_BaiHat adapter = new Adapter_BaiHat(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);

    }


}
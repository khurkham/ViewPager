package dev.khurkham.android.viewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    //private Integer [] images = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
    private Integer [] images = {
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3,
            R.drawable.slide4,
            R.drawable.slide5,
            R.drawable.slide6,
            R.drawable.slide7,
            R.drawable.slide8,
            R.drawable.slide9,
            R.drawable.slide10,
            R.drawable.slide11,
            R.drawable.slide12,
            R.drawable.slide13,
            R.drawable.slide14,
            R.drawable.slide15,
            R.drawable.slide16,
            R.drawable.slide17,
            R.drawable.slide18,
            R.drawable.slide19,
            R.drawable.slide20,
            R.drawable.slide21,
            R.drawable.slide22,
            R.drawable.slide23,
            R.drawable.slide24,
            R.drawable.slide25,
            R.drawable.slide26,
            R.drawable.slide27,
            R.drawable.slide28,
            R.drawable.slide29,
            R.drawable.slide30,
            R.drawable.slide31,
            R.drawable.slide32,
            R.drawable.slide33,
            R.drawable.slide34,
            R.drawable.slide35,
            R.drawable.slide36,
            R.drawable.slide37,
            R.drawable.slide38,
            R.drawable.slide39,
            R.drawable.slide40,
            R.drawable.slide41,

    };

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}
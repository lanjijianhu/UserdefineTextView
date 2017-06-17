package comluoexample.userdefineview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by DQ on 2017/6/16.
 */
public class LargeText extends TextView {

    public  LargeText(Context context){
        this(context,null,0);
    }

    public LargeText(Context context, AttributeSet atts){
        this(context,atts,0);
    }

    public LargeText(Context context,AttributeSet attrs,int defStyle){
        super(context,attrs,defStyle);
        TypedArray array = context.obtainStyledAttributes(attrs,R.styleable.LargeText,defStyle,0);
        int textcolor=array.getColor(R.styleable.LargeText_textcolor,0xFFFFFF);
         float textSize=array.getDimension(R.styleable.LargeText_textsize,36);
        array.recycle();//使用类型数组后回收它

        setTextSize(textSize);
        setTextColor(textcolor);
    }
}

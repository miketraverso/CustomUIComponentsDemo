package traversoft.com.customuicomponentsdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class PositiveActionButton extends Button {

    Context mContext;
    public PositiveActionButton(Context context, AttributeSet attrs, int defStyle) {

        super(context, attrs, defStyle);
        mContext = context;
        init();
    }

    public PositiveActionButton(Context context, AttributeSet attrs) {

        super(context, attrs);
        mContext = context;
        init();
    }

    public PositiveActionButton(Context context) {

        super(context);
        mContext = context;
        init();
    }

    private void init() {

        setTypeface(TypefaceManager.get(mContext, "Gotham-Bold"));
        setBackgroundColor(mContext.getColor(R.color.light_blue));
        setTextSize(19.f);
        setTextColor(mContext.getColor(R.color.white));
    }
}

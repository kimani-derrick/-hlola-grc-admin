package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.boxhdo.android.tv.R;
import java.util.Random;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class K0 extends EditText {

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f6408v = Pattern.compile("\\S+");

    /* renamed from: w  reason: collision with root package name */
    public static final W f6409w = new W(Integer.class, "streamPosition", 3);

    /* renamed from: q  reason: collision with root package name */
    public final Random f6410q;

    /* renamed from: r  reason: collision with root package name */
    public Bitmap f6411r;

    /* renamed from: s  reason: collision with root package name */
    public Bitmap f6412s;

    /* renamed from: t  reason: collision with root package name */
    public int f6413t;

    /* renamed from: u  reason: collision with root package name */
    public ObjectAnimator f6414u;

    public K0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2132017588);
        this.f6410q = new Random();
    }

    public int getStreamPosition() {
        return this.f6413t;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_one);
        this.f6411r = Bitmap.createScaledBitmap(decodeResource, (int) (decodeResource.getWidth() * 1.3f), (int) (decodeResource.getHeight() * 1.3f), false);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), R.drawable.lb_text_dot_two);
        this.f6412s = Bitmap.createScaledBitmap(decodeResource2, (int) (decodeResource2.getWidth() * 1.3f), (int) (decodeResource2.getHeight() * 1.3f), false);
        this.f6413t = -1;
        ObjectAnimator objectAnimator = this.f6414u;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(K0.class.getCanonicalName());
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(w4.l0.Z(callback, this));
    }

    public void setStreamPosition(int i7) {
        this.f6413t = i7;
        invalidate();
    }
}

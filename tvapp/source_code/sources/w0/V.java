package w0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class V extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public k0 f15490a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f15491b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15492c;
    public boolean d;

    public V(int i7, int i8) {
        super(i7, i8);
        this.f15491b = new Rect();
        this.f15492c = true;
        this.d = false;
    }

    public V(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15491b = new Rect();
        this.f15492c = true;
        this.d = false;
    }

    public V(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f15491b = new Rect();
        this.f15492c = true;
        this.d = false;
    }

    public V(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f15491b = new Rect();
        this.f15492c = true;
        this.d = false;
    }

    public V(V v5) {
        super((ViewGroup.LayoutParams) v5);
        this.f15491b = new Rect();
        this.f15492c = true;
        this.d = false;
    }
}

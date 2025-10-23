package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.boxhdo.android.tv.R;
import j.View$OnTouchListenerC0776a;
/* renamed from: k.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888g extends C0914t implements InterfaceC0892i {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0890h f12006t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0888g(C0890h c0890h, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f12006t = c0890h;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        p6.d.G(this, getContentDescription());
        setOnTouchListener(new View$OnTouchListenerC0776a(this, this));
    }

    @Override // k.InterfaceC0892i
    public final boolean a() {
        return false;
    }

    @Override // k.InterfaceC0892i
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f12006t.i();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i7, int i8, int i9, int i10) {
        boolean frame = super.setFrame(i7, i8, i9, i10);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            E.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}

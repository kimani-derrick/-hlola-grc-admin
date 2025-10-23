package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public final class R0 implements InterfaceC0868S {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f11930a;

    /* renamed from: b  reason: collision with root package name */
    public int f11931b;

    /* renamed from: c  reason: collision with root package name */
    public View f11932c;
    public Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f11933e;
    public Drawable f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11934g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f11935h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f11936i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f11937j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f11938k;

    /* renamed from: l  reason: collision with root package name */
    public int f11939l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f11940m;

    public final void a(int i7) {
        View view;
        int i8 = this.f11931b ^ i7;
        this.f11931b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    b();
                }
                int i9 = this.f11931b & 4;
                Toolbar toolbar = this.f11930a;
                if (i9 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f11940m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i8 & 3) != 0) {
                c();
            }
            int i10 = i8 & 8;
            Toolbar toolbar2 = this.f11930a;
            if (i10 != 0) {
                if ((i7 & 8) != 0) {
                    toolbar2.setTitle(this.f11935h);
                    toolbar2.setSubtitle(this.f11936i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) != 0 && (view = this.f11932c) != null) {
                if ((i7 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f11931b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f11937j);
            Toolbar toolbar = this.f11930a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f11939l);
            } else {
                toolbar.setNavigationContentDescription(this.f11937j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i7 = this.f11931b;
        if ((i7 & 2) != 0) {
            if ((i7 & 1) == 0 || (drawable = this.f11933e) == null) {
                drawable = this.d;
            }
        } else {
            drawable = null;
        }
        this.f11930a.setLogo(drawable);
    }
}

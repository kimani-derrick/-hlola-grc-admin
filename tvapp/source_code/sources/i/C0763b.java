package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* renamed from: i.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763b extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f11274a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f11275b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f11276c;
    public Resources d;

    public final void a() {
        if (this.f11275b == null) {
            this.f11275b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f11275b.setTo(theme);
            }
        }
        this.f11275b.applyStyle(this.f11274a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f11276c == null) {
                this.f11276c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f11276c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f11275b;
        if (theme != null) {
            return theme;
        }
        if (this.f11274a == 0) {
            this.f11274a = 2132017626;
        }
        a();
        return this.f11275b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i7) {
        if (this.f11274a != i7) {
            this.f11274a = i7;
            a();
        }
    }
}

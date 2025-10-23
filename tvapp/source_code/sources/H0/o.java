package H0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f858a;

    /* renamed from: b  reason: collision with root package name */
    public n f859b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f860c;
    public PorterDuff.Mode d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f861e;
    public Bitmap f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f862g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f863h;

    /* renamed from: i  reason: collision with root package name */
    public int f864i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f865j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f866k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f867l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f858a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}

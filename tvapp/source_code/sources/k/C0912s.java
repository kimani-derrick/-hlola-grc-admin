package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import h6.C0761k;
/* renamed from: k.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0912s extends ImageButton {

    /* renamed from: q  reason: collision with root package name */
    public final com.google.android.material.datepicker.c f12088q;

    /* renamed from: r  reason: collision with root package name */
    public final C.d f12089r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12090s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0912s(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        AbstractC0859I0.a(context);
        this.f12090s = false;
        AbstractC0857H0.a(this, getContext());
        com.google.android.material.datepicker.c cVar = new com.google.android.material.datepicker.c(this);
        this.f12088q = cVar;
        cVar.l(attributeSet, i7);
        C.d dVar = new C.d(this);
        this.f12089r = dVar;
        dVar.r(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.datepicker.c cVar = this.f12088q;
        if (cVar != null) {
            cVar.a();
        }
        C.d dVar = this.f12089r;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.google.android.material.datepicker.c cVar = this.f12088q;
        if (cVar != null) {
            return cVar.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.google.android.material.datepicker.c cVar = this.f12088q;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0761k c0761k;
        C.d dVar = this.f12089r;
        if (dVar == null || (c0761k = (C0761k) dVar.f326t) == null) {
            return null;
        }
        return (ColorStateList) c0761k.f11169c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0761k c0761k;
        C.d dVar = this.f12089r;
        if (dVar == null || (c0761k = (C0761k) dVar.f326t) == null) {
            return null;
        }
        return (PorterDuff.Mode) c0761k.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(((ImageView) this.f12089r.f325s).getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.google.android.material.datepicker.c cVar = this.f12088q;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        com.google.android.material.datepicker.c cVar = this.f12088q;
        if (cVar != null) {
            cVar.o(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C.d dVar = this.f12089r;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C.d dVar = this.f12089r;
        if (dVar != null && drawable != null && !this.f12090s) {
            dVar.f324r = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (!this.f12090s) {
                ImageView imageView = (ImageView) dVar.f325s;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(dVar.f324r);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f12090s = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        Drawable drawable;
        C.d dVar = this.f12089r;
        ImageView imageView = (ImageView) dVar.f325s;
        if (i7 != 0) {
            drawable = android.support.v4.media.session.b.i0(imageView.getContext(), i7);
            if (drawable != null) {
                AbstractC0869T.a(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C.d dVar = this.f12089r;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.google.android.material.datepicker.c cVar = this.f12088q;
        if (cVar != null) {
            cVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.google.android.material.datepicker.c cVar = this.f12088q;
        if (cVar != null) {
            cVar.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C.d dVar = this.f12089r;
        if (dVar != null) {
            if (((C0761k) dVar.f326t) == null) {
                dVar.f326t = new Object();
            }
            C0761k c0761k = (C0761k) dVar.f326t;
            c0761k.f11169c = colorStateList;
            c0761k.f11168b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C.d dVar = this.f12089r;
        if (dVar != null) {
            if (((C0761k) dVar.f326t) == null) {
                dVar.f326t = new Object();
            }
            C0761k c0761k = (C0761k) dVar.f326t;
            c0761k.d = mode;
            c0761k.f11167a = true;
            dVar.a();
        }
    }
}

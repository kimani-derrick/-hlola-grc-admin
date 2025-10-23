package k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import g.C0707e;
import h.AbstractC0739b;
/* renamed from: k.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913s0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12091a;

    public /* synthetic */ C0913s0(int i7) {
        this.f12091a = i7;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f12091a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C0913s0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC0739b.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e3) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e3);
                    return null;
                }
            case 1:
                try {
                    return C0707e.c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e7) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e7);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    H0.e eVar = new H0.e(context);
                    eVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return eVar;
                } catch (Exception e8) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e8);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    H0.q qVar = new H0.q();
                    qVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return qVar;
                } catch (Exception e9) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e9);
                    return null;
                }
        }
    }
}

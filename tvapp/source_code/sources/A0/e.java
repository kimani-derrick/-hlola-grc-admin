package A0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import androidx.lifecycle.C0333k;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public Parcelable f10e;
    public Object f;

    public e() {
        this.d = new m.f();
        this.f9c = true;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable a7 = P.d.a(compoundButton);
        if (a7 != null) {
            if (this.f7a || this.f8b) {
                Drawable mutate = a7.mutate();
                if (this.f7a) {
                    E.a.h(mutate, (ColorStateList) this.f10e);
                }
                if (this.f8b) {
                    E.a.i(mutate, (PorterDuff.Mode) this.f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public Bundle b(String str) {
        if (this.f8b) {
            Bundle bundle = (Bundle) this.f10e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f10e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f10e;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f10e = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public d c() {
        Map.Entry entry;
        d dVar;
        Iterator it = ((m.f) this.d).iterator();
        do {
            m.b bVar = (m.b) it;
            if (bVar.hasNext()) {
                entry = (Map.Entry) bVar.next();
                M5.g.e(entry, "components");
                dVar = (d) entry.getValue();
            } else {
                return null;
            }
        } while (!M5.g.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void d(String str, d dVar) {
        Object obj;
        M5.g.f(str, "key");
        M5.g.f(dVar, "provider");
        m.f fVar = (m.f) this.d;
        m.c b7 = fVar.b(str);
        if (b7 != null) {
            obj = b7.f12370r;
        } else {
            m.c cVar = new m.c(str, dVar);
            fVar.f12379t++;
            m.c cVar2 = fVar.f12377r;
            if (cVar2 == null) {
                fVar.f12376q = cVar;
            } else {
                cVar2.f12371s = cVar;
                cVar.f12372t = cVar2;
            }
            fVar.f12377r = cVar;
            obj = null;
        }
        if (((d) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public void e() {
        if (this.f9c) {
            a aVar = (a) this.f;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f = aVar;
            try {
                C0333k.class.getDeclaredConstructor(null);
                a aVar2 = (a) this.f;
                if (aVar2 != null) {
                    aVar2.f4a.add(C0333k.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e3) {
                throw new IllegalArgumentException("Class " + C0333k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public e(CompoundButton compoundButton) {
        this.f10e = null;
        this.f = null;
        this.f7a = false;
        this.f8b = false;
        this.d = compoundButton;
    }
}

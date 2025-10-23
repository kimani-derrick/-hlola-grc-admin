package f1;

import W5.InterfaceC0116x;
import a1.C0197a;
import java.util.Locale;
import k3.AbstractC0958a;
import z5.C1525g;
import z5.C1530l;
/* loaded from: classes.dex */
public final class x extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0660A f10329u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0660A c0660a, D5.d dVar) {
        super(2, dVar);
        this.f10329u = c0660a;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new x(this.f10329u, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((x) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object m7;
        Object obj2;
        AbstractC0958a.H(obj);
        C0197a c0197a = this.f10329u.f10207c;
        M5.g.f(c0197a, "<this>");
        String z7 = g6.o.f10858a.z();
        String language = Locale.ENGLISH.getLanguage();
        M5.d a7 = M5.p.a(String.class);
        boolean a8 = M5.g.a(a7, M5.p.a(Float.TYPE));
        B0.b bVar = c0197a.f4980a;
        if (a8) {
            obj2 = Float.valueOf(bVar.getFloat(z7, ((Float) language).floatValue()));
        } else if (M5.g.a(a7, M5.p.a(Integer.TYPE))) {
            obj2 = Integer.valueOf(bVar.getInt(z7, ((Integer) language).intValue()));
        } else if (M5.g.a(a7, M5.p.a(Long.TYPE))) {
            obj2 = Long.valueOf(bVar.getLong(z7, ((Long) language).longValue()));
        } else {
            if (M5.g.a(a7, M5.p.a(String.class))) {
                language = bVar.getString(z7, language);
            } else if (M5.g.a(a7, M5.p.a(Boolean.TYPE))) {
                obj2 = Boolean.valueOf(bVar.getBoolean(z7, ((Boolean) language).booleanValue()));
            } else {
                String string = bVar.getString(z7, "");
                if (string != null && string.length() != 0) {
                    try {
                        m7 = c0197a.f4981b.a(String.class).a(string);
                    } catch (Throwable th) {
                        m7 = AbstractC0958a.m(th);
                    }
                    if (m7 instanceof C1525g) {
                        m7 = null;
                    }
                    if (m7 != null) {
                        language = m7;
                    }
                }
            }
            M5.g.e(language, "getOrDefault(o.getKeySub… Locale.ENGLISH.language)");
            return new Y0.b(language);
        }
        language = (String) obj2;
        M5.g.e(language, "getOrDefault(o.getKeySub… Locale.ENGLISH.language)");
        return new Y0.b(language);
    }
}

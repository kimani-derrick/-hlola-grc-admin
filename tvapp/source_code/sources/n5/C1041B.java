package n5;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
/* renamed from: n5.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041B extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Class f12665a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f12666b;

    /* renamed from: c  reason: collision with root package name */
    public final Enum[] f12667c;
    public final androidx.fragment.app.D d;

    public C1041B(Class cls) {
        this.f12665a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f12667c = enumArr;
            this.f12666b = new String[enumArr.length];
            int i7 = 0;
            while (true) {
                Enum[] enumArr2 = this.f12667c;
                if (i7 < enumArr2.length) {
                    String name = enumArr2[i7].name();
                    String[] strArr = this.f12666b;
                    Field field = cls.getField(name);
                    Set set = o5.e.f12957a;
                    i iVar = (i) field.getAnnotation(i.class);
                    if (iVar != null) {
                        String name2 = iVar.name();
                        if (!"\u0000".equals(name2)) {
                            name = name2;
                        }
                    }
                    strArr[i7] = name;
                    i7++;
                } else {
                    this.d = androidx.fragment.app.D.G(this.f12666b);
                    return;
                }
            }
        } catch (NoSuchFieldException e3) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e3);
        }
    }

    @Override // n5.k
    public final Object b(n nVar) {
        int i7;
        int[] iArr;
        int i8;
        o oVar = (o) nVar;
        int i9 = oVar.f12714w;
        if (i9 == 0) {
            i9 = oVar.c0();
        }
        if (i9 >= 8 && i9 <= 11) {
            androidx.fragment.app.D d = this.d;
            if (i9 == 11) {
                i7 = oVar.e0(oVar.f12717z, d);
            } else {
                int z7 = oVar.f12712u.z((v6.u) d.f5884s);
                if (z7 != -1) {
                    oVar.f12714w = 0;
                    int[] iArr2 = oVar.f12706t;
                    int i10 = oVar.f12703q - 1;
                    iArr2[i10] = iArr2[i10] + 1;
                    i7 = z7;
                } else {
                    String O5 = oVar.O();
                    int e02 = oVar.e0(O5, d);
                    if (e02 == -1) {
                        oVar.f12714w = 11;
                        oVar.f12717z = O5;
                        oVar.f12706t[oVar.f12703q - 1] = iArr[i8] - 1;
                    }
                    i7 = e02;
                }
            }
        } else {
            i7 = -1;
        }
        if (i7 != -1) {
            return this.f12667c[i7];
        }
        String j7 = nVar.j();
        throw new RuntimeException("Expected one of " + Arrays.asList(this.f12666b) + " but was " + nVar.O() + " at path " + j7);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        qVar.y(this.f12666b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.f12665a.getName() + ")";
    }
}

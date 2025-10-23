package T3;

import e4.s0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes.dex */
public abstract class a {
    static {
        f[] fVarArr = {new f(0, S3.a.class)};
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < 1; i7++) {
            f fVar = fVarArr[i7];
            boolean containsKey = hashMap.containsKey(fVar.f3332a);
            Class cls = fVar.f3332a;
            if (!containsKey) {
                hashMap.put(cls, fVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
            }
        }
        Class cls2 = fVarArr[0].f3332a;
        Collections.unmodifiableMap(hashMap);
        f[] fVarArr2 = {new f(3, S3.a.class)};
        HashMap hashMap2 = new HashMap();
        f fVar2 = fVarArr2[0];
        boolean containsKey2 = hashMap2.containsKey(fVar2.f3332a);
        Class cls3 = fVar2.f3332a;
        if (!containsKey2) {
            hashMap2.put(cls3, fVar2);
            Class cls4 = fVarArr2[0].f3332a;
            Collections.unmodifiableMap(hashMap2);
            f[] fVarArr3 = {new f(4, S3.a.class)};
            HashMap hashMap3 = new HashMap();
            f fVar3 = fVarArr3[0];
            boolean containsKey3 = hashMap3.containsKey(fVar3.f3332a);
            Class cls5 = fVar3.f3332a;
            if (!containsKey3) {
                hashMap3.put(cls5, fVar3);
                Class cls6 = fVarArr3[0].f3332a;
                Collections.unmodifiableMap(hashMap3);
                f[] fVarArr4 = {new f(2, S3.a.class)};
                HashMap hashMap4 = new HashMap();
                f fVar4 = fVarArr4[0];
                boolean containsKey4 = hashMap4.containsKey(fVar4.f3332a);
                Class cls7 = fVar4.f3332a;
                if (!containsKey4) {
                    hashMap4.put(cls7, fVar4);
                    Class cls8 = fVarArr4[0].f3332a;
                    Collections.unmodifiableMap(hashMap4);
                    f[] fVarArr5 = {new f(6, S3.a.class)};
                    HashMap hashMap5 = new HashMap();
                    f fVar5 = fVarArr5[0];
                    boolean containsKey5 = hashMap5.containsKey(fVar5.f3332a);
                    Class cls9 = fVar5.f3332a;
                    if (!containsKey5) {
                        hashMap5.put(cls9, fVar5);
                        Class cls10 = fVarArr5[0].f3332a;
                        Collections.unmodifiableMap(hashMap5);
                        f[] fVarArr6 = {new f(7, S3.a.class)};
                        HashMap hashMap6 = new HashMap();
                        f fVar6 = fVarArr6[0];
                        boolean containsKey6 = hashMap6.containsKey(fVar6.f3332a);
                        Class cls11 = fVar6.f3332a;
                        if (!containsKey6) {
                            hashMap6.put(cls11, fVar6);
                            Class cls12 = fVarArr6[0].f3332a;
                            Collections.unmodifiableMap(hashMap6);
                            f[] fVarArr7 = {new f(5, S3.a.class)};
                            HashMap hashMap7 = new HashMap();
                            f fVar7 = fVarArr7[0];
                            boolean containsKey7 = hashMap7.containsKey(fVar7.f3332a);
                            Class cls13 = fVar7.f3332a;
                            if (!containsKey7) {
                                hashMap7.put(cls13, fVar7);
                                Class cls14 = fVarArr7[0].f3332a;
                                Collections.unmodifiableMap(hashMap7);
                                f[] fVarArr8 = {new f(8, S3.a.class)};
                                HashMap hashMap8 = new HashMap();
                                f fVar8 = fVarArr8[0];
                                boolean containsKey8 = hashMap8.containsKey(fVar8.f3332a);
                                Class cls15 = fVar8.f3332a;
                                if (!containsKey8) {
                                    hashMap8.put(cls15, fVar8);
                                    Class cls16 = fVarArr8[0].f3332a;
                                    Collections.unmodifiableMap(hashMap8);
                                    int i8 = s0.CONFIG_NAME_FIELD_NUMBER;
                                    try {
                                        a();
                                        return;
                                    } catch (GeneralSecurityException e3) {
                                        throw new ExceptionInInitializerError(e3);
                                    }
                                }
                                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls15.getCanonicalName());
                            }
                            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls13.getCanonicalName());
                        }
                        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls11.getCanonicalName());
                    }
                    throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls9.getCanonicalName());
                }
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls7.getCanonicalName());
            }
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls5.getCanonicalName());
        }
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
    }

    public static void a() {
        S3.n.h(e.f3331b);
        a4.n.a();
        S3.n.f(new h(0), true);
        S3.n.f(new h(3), true);
        Z3.l lVar = o.f3359a;
        Z3.j jVar = Z3.j.f4712b;
        jVar.e(o.f3359a);
        jVar.d(o.f3360b);
        jVar.c(o.f3361c);
        jVar.b(o.d);
        if (W3.a.f3937b.get()) {
            return;
        }
        S3.n.f(new h(2), true);
        jVar.e(l.f3353a);
        jVar.d(l.f3354b);
        jVar.c(l.f3355c);
        jVar.b(l.d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            S3.n.f(new h(4), true);
            jVar.e(r.f3364a);
            jVar.d(r.f3365b);
            jVar.c(r.f3366c);
            jVar.b(r.d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        S3.n.f(new h(5), true);
        Z3.l lVar2 = u.f3367a;
        Z3.j jVar2 = Z3.j.f4712b;
        jVar2.e(u.f3367a);
        jVar2.d(u.f3368b);
        jVar2.c(u.f3369c);
        jVar2.b(u.d);
        S3.n.f(new h(6), true);
        S3.n.f(new h(7), true);
        S3.n.f(new h(8), true);
        jVar2.e(y.f3373a);
        jVar2.d(y.f3374b);
        jVar2.c(y.f3375c);
        jVar2.b(y.d);
    }
}

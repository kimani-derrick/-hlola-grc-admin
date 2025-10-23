package A4;

import C2.g;
import H2.C0002c;
import H2.a0;
import T1.i;
import T3.k;
import T3.w;
import V4.j;
import Z2.InterfaceC0158c;
import Z3.n;
import Z3.q;
import Z3.s;
import a2.h;
import a4.C0209a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C0536n;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d2.AbstractC0552a;
import e2.InterfaceC0602e;
import e4.C0653x;
import e4.J;
import e4.r;
import e4.r0;
import e4.u0;
import g4.C0736a;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Set;
import o4.InterfaceC1071c;
import r0.AbstractC1111a;
import t3.C1251o;
import t3.InterfaceC1243g;
import w4.F0;
import x4.C1466a;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Q1.d, g, InterfaceC1071c, InterfaceC0158c, InterfaceC0602e, Q1.f, Z3.b, InterfaceC1243g, h, n {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f92q;

    public /* synthetic */ a(int i7) {
        this.f92q = i7;
    }

    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        j jVar = (j) obj;
        return m3.g.m(null);
    }

    @Override // Q1.f
    public void a(Exception exc) {
    }

    @Override // Q1.d, a2.h
    public Object apply(Object obj) {
        byte[] decode;
        boolean z7;
        switch (this.f92q) {
            case 0:
                b.f93b.getClass();
                return C1466a.f16220a.L((F0) obj).getBytes(Charset.forName("UTF-8"));
            case 26:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        C0002c a7 = i.a();
                        a7.K(rawQuery.getString(1));
                        a7.N(AbstractC0552a.b(rawQuery.getInt(2)));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a7.f1018s = decode;
                        arrayList.add(a7.l());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                if (((Cursor) obj).getCount() > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
        }
    }

    @Override // Z2.InterfaceC0158c
    public void b(Object obj) {
        ((a0) obj).f1015b.a();
    }

    @Override // C2.g
    public boolean d(int i7, int i8, int i9, int i10, int i11) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    @Override // e2.InterfaceC0602e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e2.InterfaceC0604f e(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.a.e(android.os.Bundle):e2.f");
    }

    @Override // Z3.b
    public S3.b f(s sVar) {
        T3.j jVar;
        T3.j jVar2;
        switch (this.f92q) {
            case 12:
                q qVar = (q) sVar;
                if (qVar.f4725a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        r G6 = r.G(qVar.f4727c, C0536n.a());
                        if (G6.E() == 0) {
                            T3.j jVar3 = T3.j.f3337e;
                            int size = G6.C().size();
                            if (size != 16 && size != 24 && size != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                            }
                            int B6 = G6.D().B();
                            if (B6 != 12 && B6 != 16) {
                                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(B6)));
                            }
                            r0 r0Var = qVar.f4728e;
                            int ordinal = r0Var.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                                        }
                                    }
                                }
                                jVar3 = T3.j.d;
                            } else {
                                jVar3 = T3.j.f3336c;
                            }
                            k kVar = new k(size, B6, 16, jVar3);
                            C0002c c0002c = new C0002c(13, (byte) 0);
                            c0002c.f1018s = null;
                            c0002c.f1019t = null;
                            c0002c.f1017r = kVar;
                            c0002c.f1018s = new Z5.n(C0736a.a(G6.C().l()));
                            c0002c.f1019t = qVar.f;
                            return c0002c.m();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
            case 13:
                q qVar2 = (q) sVar;
                if (qVar2.f4725a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        C0653x E4 = C0653x.E(qVar2.f4727c, C0536n.a());
                        if (E4.C() == 0) {
                            T3.j jVar4 = T3.j.f3339h;
                            int size2 = E4.B().size();
                            if (size2 != 16 && size2 != 24 && size2 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                            }
                            r0 r0Var2 = qVar2.f4728e;
                            int ordinal2 = r0Var2.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        if (ordinal2 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var2.b());
                                        }
                                    }
                                }
                                jVar4 = T3.j.f3338g;
                            } else {
                                jVar4 = T3.j.f;
                            }
                            T3.n nVar = new T3.n(size2, 12, 16, jVar4);
                            C0002c c0002c2 = new C0002c(14, (byte) 0);
                            c0002c2.f1018s = null;
                            c0002c2.f1019t = null;
                            c0002c2.f1017r = nVar;
                            c0002c2.f1018s = new Z5.n(C0736a.a(E4.B().l()));
                            c0002c2.f1019t = qVar2.f;
                            return c0002c2.n();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused2) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
            case 14:
                q qVar3 = (q) sVar;
                if (qVar3.f4725a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        e4.B E6 = e4.B.E(qVar3.f4727c, C0536n.a());
                        if (E6.C() == 0) {
                            T3.j jVar5 = T3.j.f3342k;
                            int size3 = E6.B().size();
                            if (size3 != 16 && size3 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                            }
                            r0 r0Var3 = qVar3.f4728e;
                            int ordinal3 = r0Var3.ordinal();
                            if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    if (ordinal3 != 3) {
                                        if (ordinal3 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var3.b());
                                        }
                                    }
                                }
                                jVar5 = T3.j.f3341j;
                            } else {
                                jVar5 = T3.j.f3340i;
                            }
                            T3.q qVar4 = new T3.q(size3, jVar5);
                            C0002c c0002c3 = new C0002c(15, (byte) 0);
                            c0002c3.f1018s = null;
                            c0002c3.f1019t = null;
                            c0002c3.f1017r = qVar4;
                            c0002c3.f1018s = new Z5.n(C0736a.a(E6.B().l()));
                            c0002c3.f1019t = qVar3.f;
                            return c0002c3.o();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused3) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
            case 15:
                q qVar5 = (q) sVar;
                if (qVar5.f4725a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        J E7 = J.E(qVar5.f4727c, C0536n.a());
                        if (E7.C() == 0) {
                            r0 r0Var4 = qVar5.f4728e;
                            int ordinal4 = r0Var4.ordinal();
                            if (ordinal4 != 1) {
                                if (ordinal4 != 2) {
                                    if (ordinal4 != 3) {
                                        if (ordinal4 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var4.b());
                                        }
                                    } else {
                                        jVar = T3.j.n;
                                    }
                                }
                                jVar = T3.j.f3344m;
                            } else {
                                jVar = T3.j.f3343l;
                            }
                            return T3.s.b(jVar, new Z5.n(C0736a.a(E7.B().l())), qVar5.f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused4) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
            default:
                q qVar6 = (q) sVar;
                if (qVar6.f4725a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        u0 E8 = u0.E(qVar6.f4727c, C0536n.a());
                        if (E8.C() == 0) {
                            r0 r0Var5 = qVar6.f4728e;
                            int ordinal5 = r0Var5.ordinal();
                            if (ordinal5 != 1) {
                                if (ordinal5 != 2) {
                                    if (ordinal5 != 3) {
                                        if (ordinal5 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var5.b());
                                        }
                                    } else {
                                        jVar2 = T3.j.f3347q;
                                    }
                                }
                                jVar2 = T3.j.f3346p;
                            } else {
                                jVar2 = T3.j.f3345o;
                            }
                            return w.b(jVar2, new Z5.n(C0736a.a(E8.B().l())), qVar6.f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused5) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
    }

    @Override // Z3.n
    public Object g(S3.b bVar) {
        C0209a c0209a = (C0209a) bVar;
        Object obj = new Object();
        if (AbstractC1111a.e(1)) {
            return obj;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // o4.InterfaceC1071c
    public Object h(H.e eVar) {
        switch (this.f92q) {
            case 2:
                return TransportRegistrar.a(eVar);
            case 10:
                return FirebaseInstallationsRegistrar.a(eVar);
            case 17:
                Set C3 = eVar.C(T4.a.class);
                T4.c cVar = T4.c.f3380s;
                if (cVar == null) {
                    synchronized (T4.c.class) {
                        try {
                            cVar = T4.c.f3380s;
                            if (cVar == null) {
                                cVar = new T4.c(0);
                                T4.c.f3380s = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new T4.b(C3, cVar);
            case 20:
                return FirebaseSessionsRegistrar.f(eVar);
            case 21:
                return FirebaseSessionsRegistrar.e(eVar);
            case 22:
                return FirebaseSessionsRegistrar.d(eVar);
            case 23:
                return FirebaseSessionsRegistrar.c(eVar);
            case 24:
                return FirebaseSessionsRegistrar.a(eVar);
            default:
                return FirebaseSessionsRegistrar.b(eVar);
        }
    }
}

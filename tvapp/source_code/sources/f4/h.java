package f4;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10420a;

    /* renamed from: b  reason: collision with root package name */
    public final j f10421b;

    public /* synthetic */ h(j jVar, int i7) {
        this.f10420a = i7;
        this.f10421b = jVar;
    }

    public final Object a(String str) {
        switch (this.f10420a) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < 2; i7++) {
                    Provider provider = Security.getProvider(strArr[i7]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                Iterator it = arrayList.iterator();
                Exception exc = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    j jVar = this.f10421b;
                    if (hasNext) {
                        try {
                            return jVar.j(str, (Provider) it.next());
                        } catch (Exception e3) {
                            if (exc == null) {
                                exc = e3;
                            }
                        }
                    } else {
                        return jVar.j(str, null);
                    }
                }
            case 1:
                return this.f10421b.j(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < 3; i8++) {
                    Provider provider2 = Security.getProvider(strArr2[i8]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Exception exc2 = null;
                while (it2.hasNext()) {
                    try {
                        return this.f10421b.j(str, (Provider) it2.next());
                    } catch (Exception e7) {
                        if (exc2 == null) {
                            exc2 = e7;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}

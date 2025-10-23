package B0;

import H2.C0002c;
import S3.n;
import T3.h;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import f4.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k.V0;
import o.C1053f;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f144a;
    public final S3.a d;

    /* renamed from: e  reason: collision with root package name */
    public final S3.c f147e;

    /* renamed from: c  reason: collision with root package name */
    public final String f146c = "com.hdobox.data";

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f145b = new CopyOnWriteArrayList();

    public b(SharedPreferences sharedPreferences, S3.a aVar, S3.c cVar) {
        this.f144a = sharedPreferences;
        this.d = aVar;
        this.f147e = cVar;
    }

    public static b a(Context context, d dVar) {
        C0002c c5;
        String str = dVar.f149r;
        int i7 = X3.a.f4281a;
        n.h(X3.c.f4286b);
        if (!W3.a.f3937b.get()) {
            n.f(new h(9), true);
        }
        T3.a.a();
        Context applicationContext = context.getApplicationContext();
        V0 v02 = new V0();
        v02.f = S3.b.a("AES256_SIV");
        if (applicationContext != null) {
            v02.f11960a = applicationContext;
            v02.f11961b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
            v02.f11962c = "com.hdobox.data";
            String x7 = AbstractC0515y1.x("android-keystore://", str);
            if (x7.startsWith("android-keystore://")) {
                v02.d = x7;
                Y3.a b7 = v02.b();
                synchronized (b7) {
                    c5 = b7.f4483a.c();
                }
                V0 v03 = new V0();
                v03.f = S3.b.a("AES256_GCM");
                v03.f11960a = applicationContext;
                v03.f11961b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
                v03.f11962c = "com.hdobox.data";
                String x8 = AbstractC0515y1.x("android-keystore://", str);
                if (x8.startsWith("android-keystore://")) {
                    v03.d = x8;
                    S3.a aVar = (S3.a) v03.b().a().A(S3.a.class);
                    return new b(applicationContext.getSharedPreferences("com.hdobox.data", 0), aVar, (S3.c) c5.A(S3.c.class));
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public static boolean d(String str) {
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return false;
        }
        return true;
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(f.b(this.f147e.a(str.getBytes(StandardCharsets.UTF_8), this.f146c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e3) {
                throw new AssertionError(e3);
            }
        } catch (GeneralSecurityException e7) {
            throw new SecurityException("Could not encrypt key. " + e7.getMessage(), e7);
        }
    }

    public final Object c(String str) {
        int i7;
        if (!d(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String b7 = b(str);
                String string = this.f144a.getString(b7, null);
                if (string == null) {
                    return null;
                }
                byte[] a7 = f.a(string);
                S3.a aVar = this.d;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a7, b7.getBytes(charset)));
                boolean z7 = false;
                wrap.position(0);
                int i8 = wrap.getInt();
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 != 5) {
                                        i7 = 0;
                                    } else {
                                        i7 = 6;
                                    }
                                } else {
                                    i7 = 5;
                                }
                            } else {
                                i7 = 4;
                            }
                        } else {
                            i7 = 3;
                        }
                    } else {
                        i7 = 2;
                    }
                } else {
                    i7 = 1;
                }
                if (i7 != 0) {
                    int b8 = s.h.b(i7);
                    if (b8 != 0) {
                        if (b8 != 1) {
                            if (b8 != 2) {
                                if (b8 != 3) {
                                    if (b8 != 4) {
                                        if (b8 == 5) {
                                            if (wrap.get() != 0) {
                                                z7 = true;
                                            }
                                            return Boolean.valueOf(z7);
                                        }
                                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(AbstractC1111a.B(i7)));
                                    }
                                    return Float.valueOf(wrap.getFloat());
                                }
                                return Long.valueOf(wrap.getLong());
                            }
                            return Integer.valueOf(wrap.getInt());
                        }
                        C1053f c1053f = new C1053f();
                        while (wrap.hasRemaining()) {
                            int i9 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            slice.limit(i9);
                            wrap.position(wrap.position() + i9);
                            c1053f.add(StandardCharsets.UTF_8.decode(slice).toString());
                        }
                        if (c1053f.f12795s == 1 && "__NULL__".equals(c1053f.f12794r[0])) {
                            return null;
                        }
                        return c1053f;
                    }
                    int i10 = wrap.getInt();
                    ByteBuffer slice2 = wrap.slice();
                    wrap.limit(i10);
                    String charBuffer = charset.decode(slice2).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                }
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i8);
            } catch (GeneralSecurityException e3) {
                throw new SecurityException("Could not decrypt value. " + e3.getMessage(), e3);
            }
        }
        throw new SecurityException(AbstractC0515y1.m(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (!d(str)) {
            return this.f144a.contains(b(str));
        }
        throw new SecurityException(AbstractC0515y1.m(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new a(this, this.f144a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f144a.getAll().entrySet()) {
            if (!d(entry.getKey())) {
                try {
                    String str = new String(this.f147e.b(f.a(entry.getKey()), this.f146c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, c(str));
                } catch (GeneralSecurityException e3) {
                    throw new SecurityException("Could not decrypt key. " + e3.getMessage(), e3);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z7) {
        Object c5 = c(str);
        if (c5 instanceof Boolean) {
            return ((Boolean) c5).booleanValue();
        }
        return z7;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object c5 = c(str);
        if (c5 instanceof Float) {
            return ((Float) c5).floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i7) {
        Object c5 = c(str);
        if (c5 instanceof Integer) {
            return ((Integer) c5).intValue();
        }
        return i7;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j7) {
        Object c5 = c(str);
        if (c5 instanceof Long) {
            return ((Long) c5).longValue();
        }
        return j7;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object c5 = c(str);
        if (c5 instanceof String) {
            return (String) c5;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set c1053f;
        Object c5 = c(str);
        if (c5 instanceof Set) {
            c1053f = (Set) c5;
        } else {
            c1053f = new C1053f();
        }
        if (c1053f.size() > 0) {
            return c1053f;
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f145b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f145b.remove(onSharedPreferenceChangeListener);
    }
}

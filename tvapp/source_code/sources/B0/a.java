package B0;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import f4.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C1053f;
/* loaded from: classes.dex */
public final class a implements SharedPreferences.Editor {

    /* renamed from: a  reason: collision with root package name */
    public final b f141a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences.Editor f142b;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f143c = new CopyOnWriteArrayList();

    public a(b bVar, SharedPreferences.Editor editor) {
        this.f141a = bVar;
        this.f142b = editor;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            b bVar = this.f141a;
            for (String str : ((HashMap) bVar.getAll()).keySet()) {
                if (!this.f143c.contains(str) && !b.d(str)) {
                    this.f142b.remove(bVar.b(str));
                }
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        a();
        this.f142b.apply();
        b();
        this.f143c.clear();
    }

    public final void b() {
        b bVar = this.f141a;
        Iterator it = bVar.f145b.iterator();
        while (it.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
            Iterator it2 = this.f143c.iterator();
            while (it2.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it2.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        b bVar = this.f141a;
        bVar.getClass();
        if (!b.d(str)) {
            this.f143c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String b7 = bVar.b(str);
                try {
                    Pair pair = new Pair(b7, new String(f.b(bVar.d.a(bArr, b7.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                    this.f142b.putString((String) pair.first, (String) pair.second);
                    return;
                } catch (UnsupportedEncodingException e3) {
                    throw new AssertionError(e3);
                }
            } catch (GeneralSecurityException e7) {
                throw new SecurityException("Could not encrypt data: " + e7.getMessage(), e7);
            }
        }
        throw new SecurityException(AbstractC0515y1.m(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.d.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f143c;
        a();
        try {
            return this.f142b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z7) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z7 ? (byte) 1 : (byte) 0);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i7);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j7) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j7);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C1053f();
            set.add("__NULL__");
        }
        ArrayList arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        for (String str2 : set) {
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putInt(1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] bArr = (byte[]) it.next();
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        c(str, allocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        b bVar = this.f141a;
        bVar.getClass();
        if (!b.d(str)) {
            this.f142b.remove(bVar.b(str));
            this.f143c.add(str);
            return this;
        }
        throw new SecurityException(AbstractC0515y1.m(str, " is a reserved key for the encryption keyset."));
    }
}

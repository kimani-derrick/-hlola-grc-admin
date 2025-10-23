package E0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f532e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f533a;

    /* renamed from: b  reason: collision with root package name */
    public final File f534b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f535c;
    public FileChannel d;

    public a(String str, File file, boolean z7) {
        File file2;
        Lock lock;
        this.f533a = z7;
        if (file != null) {
            file2 = new File(file, str.concat(".lck"));
        } else {
            file2 = null;
        }
        this.f534b = file2;
        HashMap hashMap = f532e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f535c = lock;
    }

    public final void a(boolean z7) {
        this.f535c.lock();
        if (z7) {
            File file = this.f534b;
            try {
                if (file != null) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileChannel channel = new FileOutputStream(file).getChannel();
                    channel.lock();
                    this.d = channel;
                    return;
                }
                throw new IOException("No lock directory was provided.");
            } catch (IOException e3) {
                this.d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e3);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f535c.unlock();
    }
}

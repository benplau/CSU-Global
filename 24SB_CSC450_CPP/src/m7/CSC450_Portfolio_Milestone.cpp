//#include <iostream>
//#include <thread>
//#include <mutex>
//#include <condition_variable>
//#include <chrono>
//
//using namespace std;
//
//mutex mtx;
//condition_variable cv;
//bool countUpFinished = false;
//
//void countUp() {
//    for (int i = 0; i <= 20; ++i) {
//        {
//            lock_guard<mutex> lock(mtx);
//            cout << i << endl;
//        }
//        this_thread::sleep_for(chrono::milliseconds(100));
//    }
//    {
//        lock_guard<mutex> lock(mtx);
//        countUpFinished = true;
//    }
//    cv.notify_one();
//}
//
//void countDown() {
//    {
//        unique_lock<mutex> lock(mtx);
//        cv.wait(lock, [] { return countUpFinished; });
//    }
//
//    for (int i = 19; i >= 0; --i) {
//        {
//            lock_guard<mutex> guard(mtx);
//            cout << i << endl;
//        }
//        this_thread::sleep_for(chrono::milliseconds(100));
//    }
//}
//
//int main() {
//    thread t1(countUp);
//    thread t2(countDown);
//
//    t1.join();
//    t2.join();
//
//    return 0;
//}

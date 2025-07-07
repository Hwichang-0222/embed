package org.chapter09_01_Ex;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
//		nickName = chatId;
		
		class Chat {
			public void start() {
				while (true) {
					String inputData = "Hello";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage (String message) {
			}
		}
		
		Chat chat = new Chat();
		chat.start();
		
	}
}
